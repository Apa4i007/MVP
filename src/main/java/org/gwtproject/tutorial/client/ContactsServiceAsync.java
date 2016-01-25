package org.gwtproject.tutorial.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.gwtproject.tutorial.shared.Contact;
import org.gwtproject.tutorial.shared.ContactDetails;

import java.util.ArrayList;

public interface ContactsServiceAsync {

    public void addContact(Contact contact, AsyncCallback<Contact> callback);

    public void deleteContact(String id, AsyncCallback<Boolean> callback);

    public void deleteContacts(ArrayList<String> ids, AsyncCallback<ArrayList<ContactDetails>> callback);

    public void getContactDetails(AsyncCallback<ArrayList<ContactDetails>> callback);

    public void getContact(String id, AsyncCallback<Contact> callback);

    public void updateContact(Contact contact, AsyncCallback<Contact> callback);
}

