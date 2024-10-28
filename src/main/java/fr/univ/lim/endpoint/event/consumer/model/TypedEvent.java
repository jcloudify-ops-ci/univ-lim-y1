package fr.univ.lim.endpoint.event.consumer.model;

import fr.univ.lim.PojaGenerated;
import fr.univ.lim.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
