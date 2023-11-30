package dao;

import java.util.List;

import pojos.entities.Address;

public interface AddrDao {
	String addEmployeeAddress(Address empAddr, String email);
	
	String addEmployeeAddressById(Address addr, Long Id);
	
	String getEmployeeAddress(Long Id);
	
	List<String> getLastNamesOfEmployeesByCity(String city);
}
