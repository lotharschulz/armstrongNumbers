organization  := "info.lotharschulz"

name :="armstrongNumbers"

scalaVersion :="2.11.7"

version :="1.0-SNAPSHOT"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-Xlint", "-Ywarn-adapted-args", "-Xfatal-warnings", "-feature")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    ,"org.scalacheck" %% "scalacheck" % "1.11.6" % "test"
  )
}

// intelliJ
// http://stackoverflow.com/questions/19578611/idea-complains-about-revolver-settings-when-trying-to-parse-spray-templates-bui
Revolver.settings: Seq[sbt.Def.Setting[_]]

pomExtra :=
  <scm>
    <url>https://github.com/lotharschulz/armstrongNumbers</url>
    <connection>scm:git:github.com/lotharschulz/armstrongNumbers.git</connection>
    <developerConnection>scm:git:https://github.com/lotharschulz/armstrongNumbers.git</developerConnection>
  </scm>
    <developers>
      <developer>
        <id>lotharschulz</id>
        <name>lothar</name>
        <email>mail[at]lothar[minus]schulz[dot]info</email>
        <url>https://github.com/lotharschulz</url>
      </developer>
    </developers>