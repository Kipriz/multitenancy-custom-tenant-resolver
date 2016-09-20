/* Multitenancy setup */
grails {
    gorm {
        multiTenancy {
            mode = "DATABASE"
        }
        failOnError = true
    }
}

dataSource {
    dbCreate = "create-drop"
    url = "jdbc:h2:mem:books"
}

dataSources {
    moreBooks {
        dbCreate = "create-drop"
        url = "jdbc:h2:mem:moreBooks"
    }
    evenMoreBooks {
        dbCreate = "create-drop"
        url = "jdbc:h2:mem:evenMoreBooks"
    }
}