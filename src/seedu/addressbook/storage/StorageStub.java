package seedu.addressbook.storage;

import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage.StorageOperationException;

public class StorageStub implements Storage{

	public StorageStub() {}
	
	public AddressBook load() throws StorageOperationException {
		
		return new AddressBook();
	}
	
	public void save(AddressBook addressBook) throws StorageOperationException {
		//empty method
	}
	
	public String getPath() {
		
		return "";
	}
	
	public Storage initialize() {
		
		return null;
	}
}
