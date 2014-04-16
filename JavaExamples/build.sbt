name := "JavaExamples"

version := "1.0"

organization := "com.mblinn"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.3" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test"

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")
