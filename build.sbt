name := "SampleSpark"

scalaVersion := "2.11.0"

val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion
)
