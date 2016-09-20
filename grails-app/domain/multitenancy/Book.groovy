package multitenancy

import grails.gorm.MultiTenant

class Book implements MultiTenant<Book> {
    String name
    String author
}