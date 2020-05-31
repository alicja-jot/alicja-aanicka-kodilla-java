package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("banan");
        Product product2 = new Product("pomarancza");

        Invoice invoice1 = new Invoice("2020030601");

        Item item1 = new Item(product1, new BigDecimal(100), 3, new BigDecimal(300), invoice1);
        Item item2 = new Item(product2, new BigDecimal(100), 1, new BigDecimal(100), invoice1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        Invoice savedInvoice = invoiceDao.save(invoice1);

        int savedInvoiceId = savedInvoice.getId();

        // When
        Optional<Invoice> resultInvoice = invoiceDao.findById(savedInvoiceId);

        // Then
        assertTrue(resultInvoice.isPresent());

        // CleanUp
        invoiceDao.deleteById(savedInvoiceId);
        productDao.deleteAll();
    }


}
