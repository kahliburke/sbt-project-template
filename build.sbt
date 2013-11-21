name := "blank"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.3"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq (
	"org.scalatest" %% "scalatest" % "2.0" % "test"
)
