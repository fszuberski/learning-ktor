package com.fszuberski.plugins

import com.fszuberski.routes.customerRouting
import com.fszuberski.routes.getOrderRoute
import com.fszuberski.routes.listOrdersRoute
import com.fszuberski.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
