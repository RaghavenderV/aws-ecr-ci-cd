FROM openjdk:17
#FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
# set working directory inside the container
WORKDIR /app
# copy jar file into the container
COPY ./target/aws-ecr-ci-cd.jar /app
# expose the port the application will run on
EXPOSE 8080
# command to run the application
CMD ["java","-jar","aws-ecr-ci-cd.jar"]