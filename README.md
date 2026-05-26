# Cloud Run - SafetyNetAccess.org web site Spring Boot Application

The safetyneaccess application renders a simple web site at [SafetyNetAccess.org](https://www.safetynetaccess.org/).

## DOCKER
## Build the image locally:
docker build -t 'REGION'-docker.pkg.dev/'PROJECT ID'/'ARTIFACT REPOSITORY'/'SERVICE':v1.0.6 .

## Push it to your existing repository:
docker push 'REGION'-docker.pkg.dev/'PROJECT ID'/'ARTIFACT REPOSITORY'/'SERVICE':v1.0.6

## Push to Docker Hub
docker push safetynetaccessorg/'SERVICE':v1.0.6

## Make sure to Set Project
gcloud config set project 'PROJECT ID'

## Maybe need auth
gcloud auth application-default login

## Tell Cloud Run to use the new image:
gcloud run deploy 'SERVICE' --image 'REGION'-docker.pkg.dev/'PROJECT ID'/'ARTIFACT REPOSITORY'/'SERVICE':v1.0.6 --region 'REGION'


![BGSafetyNetAccessBorder.jpg](https://www.safetynetaccess.org/images/BGSafetyNetAccessBorder.jpg)