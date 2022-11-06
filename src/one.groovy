class one {
   static String foo = "bar"
   checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: src]], branches: [[name: 'refs/tags/3.6.1']]], poll: false
}
