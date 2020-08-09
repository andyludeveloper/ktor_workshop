package com.andyludeveloper

import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.util.pipeline.PipelineContext
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.li
import kotlinx.html.ul

suspend fun PipelineContext<Unit, ApplicationCall>.htmlDsl() {
    call.respondHtml {
        body {
            h1 { +"HTML" }
            ul {
                for (n in 1..10) {
                    li { +"$n" }
                }
            }
        }
    }
}