package com.acme.workflows.loyalty.kotlin

import io.infinitic.workers.InfiniticWorker

fun main() {
    // infinitic.yml resource is from the dependant "contracts" module
    InfiniticWorker.fromConfigResource("/infinitic.yml", "/loyalty.yml").use { worker ->
        worker.start()
    }
}