package org.acme;

import org.acme.model.Ticket;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)


public class TicketResource {
    @GET
    public List<Ticket> getAll() {

        return Ticket.listAll();

    }

}
