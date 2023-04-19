package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Payment;
import gov.iti.jets.web.models.PaymentModel;
import gov.iti.jets.web.persistence.dao.PaymentDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class PaymentService {
    PaymentDao paymentDao = new PaymentDao();
    ModelMapper modelMapper = new ModelMapper();

    public PaymentService() {
    }

    public List<PaymentModel> getAllPayments(){
        return modelMapper.map(paymentDao.getAll("Payment.findAll"), new TypeToken<List<PaymentModel>>(){}.getType());
    }

    public PaymentModel getPaymentById(int id){
        return modelMapper.map(paymentDao.getById(Payment.class,id), PaymentModel.class);
    }

    public PaymentModel addPayment(PaymentModel paymentModel){

        Payment payment = paymentDao.add(modelMapper.map(paymentModel, Payment.class));
        PaymentModel addedPayment = modelMapper.map(payment, PaymentModel.class);
        return addedPayment;
    }

    public boolean updatePayment(PaymentModel paymentModel){
        return paymentDao.update(modelMapper.map(paymentModel, Payment.class));
    }

    public boolean deletePayment(int id){
        return paymentDao.deleteById(id, Payment.class);
    }
}
