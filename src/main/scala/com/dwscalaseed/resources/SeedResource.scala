package com.dwscalaseed.resources

import javax.ws.rs.{PathParam, GET, Produces, Path}
import javax.ws.rs.core.MediaType
import com.codahale.metrics.annotation.Timed
import com.dwscalaseed.api.SeedRepresentation
import com.dwscalaseed.SeedConfiguration

@Path("/seed")
@Produces(Array(MediaType.APPLICATION_JSON))
class SeedResource (seedConfiguration : SeedConfiguration) {

  @GET
  @Timed
  def seed() : String = {
    new SeedRepresentation(seedConfiguration.seedConfigurationEntry).message
  }

  @GET
  @Path("{message}")
  def seedPathParam(@PathParam("message") message : String) : String = {
    new SeedRepresentation("Your message was - " + message).message
  }

}
