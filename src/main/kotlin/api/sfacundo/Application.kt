package api.sfacundo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("api.sfacundo")
		.start()
}

