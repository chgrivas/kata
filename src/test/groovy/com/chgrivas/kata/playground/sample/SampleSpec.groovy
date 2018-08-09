package com.chgrivas.kata.playground.sample

import spock.lang.Specification

class SampleSpec extends Specification {

  def "sample test"() {
    when:
      def a = 1
    then:
      a == 1
  }
}
