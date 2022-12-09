package com.swaglabs.certification.website.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ListaDeProductosPage extends PageObject {

    public static final Target LBL_PRODUCTO = Target.the("Nombre del producto").
            locatedBy("//div[@class='inventory_item_name'][contains(text(),'{0}')]");
    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("Agregar producto al carrito").
            locatedBy("//button[contains(@id,'{0}')]");
    public static final Target BTN_CARRITO = Target.the("Icono del carrito de compras").
            locatedBy("//div[@id='shopping_cart_container']");
    public static final Target LBL_PAGINA_PRODUCTOS= Target.the("Texto confirmación pagina de productos").
            locatedBy("//span[text()='Products']");

}
