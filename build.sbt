name := "MusicServer"
 
version := "1.0" 
      
lazy val `musicserver` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.1"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.44"

libraryDependencies += "net.logstash.logback" % "logstash-logback-encoder" % "4.11"


libraryDependencies += "com.netaporter" %% "scala-uri" % "0.4.16"
