#!/usr/bin/groovy
import  groovy.transform.Field


def call(String name = 'human') {
  echo "Hello, ${name}."
}

