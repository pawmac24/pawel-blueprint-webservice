Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.pawel.fuse.example/pawel-blueprint-webservice/1.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/

Test in SOAP UI:
Soap consumer endpoint:
http://localhost:9191/cxf/claim
http://localhost:9191/cxf/claim?wsdl

Restful producer endpoint:
http://localhost:9191/cxf/status/status/custId/A12345
http://localhost:9191/cxf/status/status/restcancel/B345678

Based on tutorial:
https://vimeo.com/115418661
https://vimeo.com/115560431
https://github.com/jbossdemocentral/jboss-fuse-component-cxf-cxfrs

Run fuse in fuse_xxx/bin
    fuse

Deploy using fabric8:
    fabric:create --wait-for-provisioning
    mvn fabric8:deploy
    http://localhost:8181/hawtio/login
    Create container with profile claim
    http://localhost:8181/hawtio/fabric/containers
