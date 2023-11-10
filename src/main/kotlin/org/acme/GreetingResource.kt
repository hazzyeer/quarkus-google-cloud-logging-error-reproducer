package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.jboss.logging.Logger


@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        logger.info("Hello endpoint called.");
        return "Hello from RESTEasy Reactive"
    }

    companion object {
        private val logger: Logger = Logger.getLogger(GreetingResource::class.java)
    }
}