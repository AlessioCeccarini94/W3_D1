//CLIENTE CON NOME MARIO:
//
//--SELECT * FROM public.client WHERE name='Mario'
//
//
//NOME E COGNOME CLIENTI 1982:
//
//--SELECT name,surname FROM public.client WHERE EXTRACT( YEAR FROM date_of_birth)=1982
//
//
//FATTURE CON IMPORRTO<1000:
//
//--SELECT * FROM public.invoices WHERE import<1000
//JOIN client USING(id_client)
//
//
//TOTALE IMPORTO FATTURE E SOMMA:
//
//--SELECT count(*),sum(import) FROM public.invoices
//
//
//TOTALE FATTURE CON IVA 20:
//
//select count(*) from invoices where iva_import =20
//
//
//TOTALE FATTURE 2017:
//
//select count(*) from invoices where iva_import =20 and EXTRACT( YEAR FROM date)=2017