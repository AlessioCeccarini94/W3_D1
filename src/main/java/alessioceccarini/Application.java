//CLIENTE CON NOME MARIO:
//
//--SELECT * FROM public.client WHERE name='Mario'
//
//
//NOME E COGNOME CLIENTI 1982:
//
//--SELECT * FROM public.client WHERE EXTRACT( YEAR FROM date_of_birth)=1982
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