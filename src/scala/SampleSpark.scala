import org.apache.spark.{ SparkConf, SparkContext }

object SampleSpark {
	def main(args :Array[String]) {
		val conf = new SparkConf()
				.set("spark.name", "Sample")
				.set("spark.master", "local[2]")
		val sc = new SparkContext(conf)
	}
}
