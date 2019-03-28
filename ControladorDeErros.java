class ControladorDeErros implements Cloneable
{
    private int qMax, qErr=0;

    public ControladorDeErros (int qm) throws Exception
    {
        if (qm<=0)
            throw new Exception ("Tentativa de criar um controlador de erros que admite quantidade maxima de erros negativa!");

        this.qMax = qm;
    }

    public void registreUmErro () throws Exception
    {
        // alterar dados private de forma a expressar que
        // um novo erro foi cometido
    }

    public boolean isMaximoDeErrosAtingido  ()
    {
        return this.qErr == this.qMax;
    }

    public String toString ()
    {
        return this.qErr + "/" + this.qMax;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
	int ret = 1;
	
	

	
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception
    {
        // copiar c.qMax e c.qErr, respectivamente em, this.qMax e this.qErr
	
	if (ControladorDeErros c.qMax == null)
	{
		throw new Exception (“Modelo Ausente”);
	}
	
	else
	{
		this.qMax = ControladorDeErros.qMax
	}

	if (ControladorDeErros c.qErr == null)
	{
		throw new Exception (“Modelo Ausente”);
	}
	
	else
	{
		this.qErr = ControladorDeErros.qErr
	}
	

    }

    public Object clone ()
    {
        // returna uma cópia de this
	
	ControladorDeErros copia = null;
	
	try
	{
		copia = new ControladorDeErros (this);
	}

	catch (Exception erro)
	{} // sei que nao vai dar erro

	return copia;
    }
}