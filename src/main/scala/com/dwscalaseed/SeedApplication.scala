package com.dwscalaseed

import com.massrelevance.dropwizard.ScalaApplication
import io.dropwizard.setup.{Environment, Bootstrap}
import com.massrelevance.dropwizard.bundles.ScalaBundle
import com.dwscalaseed.resources.SeedResource
import com.dwscalaseed.health.SeedHealthCheck

object SeedApplication extends ScalaApplication[SeedConfiguration] {

  def initialize(bootstrap: Bootstrap[SeedConfiguration]) {
    bootstrap.addBundle(new ScalaBundle)
  }

  def run(configuration: SeedConfiguration, environment: Environment) {
    environment.jersey().register(new SeedResource(configuration))
    environment.healthChecks().register("Example Healthcheck", new SeedHealthCheck)
  }

}
