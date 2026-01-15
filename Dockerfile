# ---- Build Stage ----
FROM maven:3.8.8-eclipse-temurin-8 AS build
WORKDIR /build
COPY . .
RUN ./mvnw package

# ---- Liberty Stage ----
FROM icr.io/appcafe/open-liberty:full-java8-openj9-ubi

# Copy server.xml (adjust path if needed)
COPY --chown=1001:0 src/webapp/WEB-INF/server.xml /config/server.xml

# Copy WAR from build stage
COPY --chown=1001:0 --from=build /build/target/budget-specialist.war /config/apps

RUN configure.sh