package com.informatica.ProductsOnStock;


import com.informatica.clases.Producto;
import java.util.ArrayList;

public class ProductosExistentes {
    private ArrayList<Producto> productosOnStock;

    public ProductosExistentes(){
        productosOnStock = new ArrayList<>();
        //creacion de array list para los combos.
        ArrayList<Producto> comboClasico = new ArrayList<>();
        ArrayList<Producto> comboPicante = new ArrayList<>();
        ArrayList<Producto> comboTenders = new ArrayList<>();
        ArrayList<Producto> comboFamiliarClasico = new ArrayList<>();
        ArrayList<Producto> comboFamiliarPicante = new ArrayList<>();
        ArrayList<Producto> promoDiaDelNinio = new ArrayList<>();
        ArrayList<Producto> diaHalloween = new ArrayList<>();

        //Clases de productos
        Producto pollo_frito_clasico_pechuga = new Producto("Pollo Frito Clásico Pechuga", 10.00F,"Comida" ,true);
        productosOnStock.add(pollo_frito_clasico_pechuga);
        Producto polloFritoClasicoAlitas = new Producto("Pollo Frito Clásico Alitas", 9.00F,"Comida" ,true);
        productosOnStock.add(polloFritoClasicoAlitas);
        Producto polloFritoClasicoPierna = new Producto("Pollo Frito Clásico Pierna", 9.00F, "Comida",true);
        productosOnStock.add(polloFritoClasicoPierna);
        Producto pollofritoPicante = new Producto("Pollo Frito Picante", 11.50F, "Comida",true);
        productosOnStock.add(pollofritoPicante);
        Producto alitasPollo = new Producto("Paquete alitas de Pollo Fritas", 40.00F, "Comida",true);
        productosOnStock.add(alitasPollo);
        Producto tendersPollo = new  Producto("Tenders de Pollo Frito", 9.50F, "Comida",true);
        productosOnStock.add(tendersPollo);
        Producto ensalada = new Producto("ensalada", 5.00F, "Comida",true);
        productosOnStock.add(ensalada);
        Producto papasFritas = new Producto("papas fritas", 6.00F, "Comida",true);
        productosOnStock.add(papasFritas);
        Producto cocaColaLata = new Producto("coca cola lata", 6.00F, "Bebida",true);
        productosOnStock.add(cocaColaLata);
        Producto cocaColaYumbo = new Producto("coca cola yumbo", 14.00F, "Bebida",true);
        productosOnStock.add(cocaColaYumbo);
        Producto frescoCrema = new Producto("fresco de crema", 10.00F, "Bebida",true);
        productosOnStock.add(frescoCrema);
        Producto heladoSundae = new Producto("helado tipo sundae", 5.00F, "Postre",true);
        productosOnStock.add(heladoSundae);
        Producto burguersPollo = new Producto("burguers de Pollo Frito",23.50f,"Nuevo Producto",true);
        productosOnStock.add(burguersPollo);
        Producto tacosPollo = new Producto("tacos de pollo frito",7.50f,"Nuevo Producto",true);
        productosOnStock.add(tacosPollo);

        //combo clasico
        comboClasico.add(pollo_frito_clasico_pechuga);
        comboClasico.add(papasFritas);
        comboClasico.add(cocaColaLata);
        Producto combo_clasico = new Producto("Combo Clasico", 22.00f,"Combo",comboClasico);
        productosOnStock.add(combo_clasico);

        //combo picante
        comboPicante.add(pollofritoPicante);
        comboPicante.add(papasFritas);
        comboPicante.add(cocaColaLata);
        Producto combo_Picante = new Producto("Combo Picante",22.50f,"Combo",comboPicante);
        productosOnStock.add(combo_Picante);

        //combo tenders de pollo
        comboTenders.add(tendersPollo);
        comboTenders.add(ensalada);
        comboTenders.add(cocaColaLata);
        Producto combo_Tenders = new Producto("Combo tenders de pollo", 20.50f,"Combo",comboTenders);
        productosOnStock.add(combo_Tenders);

        //combo familiar clasico
        comboFamiliarClasico.add(alitasPollo);
        comboFamiliarClasico.add(papasFritas);
        comboFamiliarClasico.add(cocaColaYumbo);
        comboFamiliarClasico.add(heladoSundae);
        Producto combo_Familiar_Clasico = new Producto("Combo Familiar Clasico", 50.00f,"Combo",comboFamiliarClasico);
        productosOnStock.add(combo_Familiar_Clasico);

        //combo familiar picante
        comboFamiliarPicante.add(pollo_frito_clasico_pechuga);
        comboFamiliarPicante.add(polloFritoClasicoPierna);
        comboFamiliarPicante.add(cocaColaYumbo);
        comboFamiliarPicante.add(heladoSundae);
        Producto combo_Familiar_Picante = new Producto("Combo familiar picante", 55.50f,"Combo",comboFamiliarPicante);
        productosOnStock.add(combo_Familiar_Picante);

        //Promo dia del niño
        promoDiaDelNinio.add(pollo_frito_clasico_pechuga);
        promoDiaDelNinio.add(heladoSundae);
        promoDiaDelNinio.add(cocaColaLata);
        promoDiaDelNinio.add(papasFritas);
        Producto Promo_Dia_Ninio = new Producto("Promocion dia del ninio",25.00f,"Promocion",promoDiaDelNinio);
        productosOnStock.add(Promo_Dia_Ninio);

        //Promo halloween
        diaHalloween.add(tendersPollo);
        diaHalloween.add(alitasPollo);
        diaHalloween.add(papasFritas);
        diaHalloween.add(cocaColaYumbo);
        Producto Promo_Dia_Halloween = new Producto("Promocion halloween",60.99f,"Promocion",diaHalloween);
        productosOnStock.add(Promo_Dia_Halloween);

    }


    public ArrayList<Producto> getProductosOnStock() {
        return productosOnStock;
    }

    public void setProductosOnStock(ArrayList<Producto> productosOnStock) {
        this.productosOnStock = productosOnStock;
    }


}
