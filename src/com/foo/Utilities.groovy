package com.foo
class Utilities {
  static def mvn(script, args) {
    script.sh "echo Would run maven stuff now; sleep 4"
  }
}
