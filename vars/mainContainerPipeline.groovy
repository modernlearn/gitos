#!/usr/bin/groovy
import  groovy.transform.Field


def call(Map propertyInfo) {
  echo "Hello, ${propertyInfo.label}."
    checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: 'https://github.com/modernlearn/gitos.git']], branches: [[name: 'refs/tags/3.6.1']]], poll: false
   println "here we are testing"
}

