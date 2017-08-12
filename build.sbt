name := "PriceCrypter"

organization := "org.openx.market.ssrtb"

version := "0.0.4"

// project description
description := "Can encrypt and decrypt price macros."

crossPaths := false
autoScalaLibrary := false

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.10",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)
