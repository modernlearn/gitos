#!/usr/bin/groovy
import  groovy.transform.Field


def call(Map propertyInfo) {
  echo "Hello, ${propertyInfo.label}."
}

