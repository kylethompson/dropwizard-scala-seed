package com.dwscalaseed

import io.dropwizard.Configuration
import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonProperty

class SeedConfiguration extends Configuration {

  @NotEmpty
  @JsonProperty
  val seedConfigurationEntry: String = null

}
