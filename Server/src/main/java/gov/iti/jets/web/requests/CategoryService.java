package gov.iti.jets.web.requests;

import gov.iti.jets.web.entities.Category;
import gov.iti.jets.web.models.CategoryModel;
import gov.iti.jets.web.persistence.dao.CategoryDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class CategoryService {

    CategoryDao categoryDao = new CategoryDao();
    ModelMapper modelMapper = new ModelMapper();

    public CategoryService() {
    }

    public List<CategoryModel> getAllCategories(){
        return modelMapper.map(categoryDao.getAll("Category.findAll"), new TypeToken<List<CategoryModel>>(){}.getType());
    }

    public CategoryModel getCategoryById(int id){
        return modelMapper.map(categoryDao.getById(Category.class,id), CategoryModel.class);
    }

    public CategoryModel addCategory(CategoryModel categoryModel){

        Category category = categoryDao.add(modelMapper.map(categoryModel, Category.class));
        CategoryModel addedCategory = modelMapper.map(category, CategoryModel.class);
        return addedCategory;
    }

    public boolean updateCategory(CategoryModel categoryModel){
        return categoryDao.update(modelMapper.map(categoryModel, Category.class));
    }

    public boolean deleteCategory(int id){
        return categoryDao.deleteById(id, Category.class);
    }

}
