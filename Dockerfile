From openjdk:11
copy ./target/mongoapp.jar mongoapp.jar
CMD ["java","-jar","mongoapp.jar"]