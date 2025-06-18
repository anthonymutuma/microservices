package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Accounts Details based on a given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);
    /**
     * Updates the account details for a given customer.
     *
     * @param customerDto - CustomerDto Object containing the updated account and customer details.
     * @return boolean indicating if the update was successful or not.
     */
    boolean updateAccount(CustomerDto customerDto);


    boolean deleteAccount(String mobileNumber);
}
