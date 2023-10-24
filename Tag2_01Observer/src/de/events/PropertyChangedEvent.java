package de.events;

public record PropertyChangedEvent(Object source, String name, Object oldValue, Object newValue) {


}
