package com.dwscalaseed.api

import org.specs2.mutable._

class SeedRespresentationTests extends Specification {

  "The seed representation" should {
    "correctly store a string message" in {
      val seedRepresentation = new SeedRepresentation("Test string")
      seedRepresentation.message must beEqualTo("Test string")
    }
  }

}