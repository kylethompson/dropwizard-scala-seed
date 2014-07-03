package com.dwscalaseed.health

import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

class SeedHealthCheck extends HealthCheck {

  def check : Result = {
    Result.healthy("Everything is fine")
  }

}
