#!/usr/bin/groovy
import  groovy.transform.Field

@Field
def release = new release ()
@Field
def image = new release ()
@Fieldl
def fortify = new fortify ()
@Field
def sonar = new sonarUtils ()
def call(String name = 'human') {
  echo "Hello, ${name}."
}

