// A classe "signo" é responsavel por determinar o signo do zodiaco com base na data de nascimento
public class signo {

    // Metodo para determinar o signo com base na data de nascimento
    public String determinarsigno(String data) {
        //Divide a data em partes usando o caractere '/'
        String[] partesdata = data.split("/");

        //Verifica se existem três partes (dia, ,mês, ano)
        if (partesdata.length ! = 3) {
            return "dados inválidos"; // Retorna uma menssagem de erros se os dados estiveerem incompletos
        }
    }

    // Converte as partes em nùmeros inteiros para validação
    int dia = Integer.parseInt(partesdata(0));
    int mes = Integer.parseInt(partesdata(1));

    // Verifica a validade dos dados inseridos (mês entre 1 e 12, dia entre 1 31)
    if(mes<1||mes>12||dia 1||dia>31)
    {
        return "dados inválidos"; // Retorna uma menssagem de erro se os dados estiverem incorretas
    }

    // Determinar o signo com base no mês e dia de nascimento
    switch(mes)
    {
        case 1: 
            if (dia >= 20)
                return "aquário";
            else
                return "capricórnio";

        case 2: 
            if (dia >= 20)
                return "peixes";
            else
               return "aquário";    
        
        case 3: 
            if (dia >= 20)
                return "áries";
            else
                return "peixes";

        case 4: 
            if (dia >= 20)
                return "touro";
            else
                return "áries";

        case 5: 
            if (dia >= 20)
                return "gêmeos";
            else
                return "touro'"; 

        case 6: 
            if (dia >= 21)
                return "câncer";
            else
                return "gêmeos";

            case 7:
            if (dia >= 23)
                return "Leão";
            else
                return "Câncer";
        case 8:
            if (dia >= 23)
                return "Virgem";
            else
                return "Leão";
        case 9:
            if (dia >= 23)
                return "Libra";
            else
                return "Virgem";
        case 10:
            if (dia >= 23)
                return "Escorpião";
            else
                return "Libra";
        case 11:
            if (dia >= 22)
                return "Sargitário";
            else
                return "Escorpião";
        case 12:
            if (dia >= 22)
                return "Capricórnio";
            else
                return "Sargitário";
        default:
            return "Dados inválidos!";

    }
}
