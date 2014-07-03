#/bin/bash

echo "Building assembly"
#./sbt assembly

echo "Running assembly"
java -jar target/dropwizard-scala-seed-assembly-1.0.0.jar server SeedApplicationConfiguration.yml



