package org.gwtproject.tutorial.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface ContactDeletedEventHandler extends EventHandler {
    void onContactDeleted(ContactDeletedEvent event);
}
