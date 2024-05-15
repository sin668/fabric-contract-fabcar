#FROM harbor.base.yichengpai.cn/hyperledger/fabric-javaenv@sha256:b59192edd99b75e0f28442932f9ff0fc81b7ce013fa349a114d1f6868b9bca26
FROM image-registry.openshift-image-registry.svc:5000/openshift/fabric-javaenv:2.4.5
ENV JAVA_APP_DIR=./chaincode-java
LABEL org.label-schema.description="Spring Boot - HTTP Example" org.label-schema.version=2.3.2-1-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2022-05-25T07:32:41.736 org.label-schema.name="Spring Boot - HTTP Example" org.label-schema.url=https://www.snowdrop.dev/rest-http
EXPOSE 8080 8778 9779
COPY maven ./chaincode-java/
