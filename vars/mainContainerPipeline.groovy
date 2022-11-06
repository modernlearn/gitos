#!/usr/bin/groovy
import  groovy.transform.Field


def call(Map propertyInfo) {
  echo "Hello, ${propertyInfo.label}."
    checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: 'https://github.com/modernlearn/gitos.git']], branches: [[name: 'refs/tags/0935']]], poll: false
    sh echo 'Hola Crayol'
  println "here we are testing"
}

