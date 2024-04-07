package Estudo;

public class App {
    int[] s = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
        178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
        243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
        317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
        396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
        443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
        525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
        626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
        723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
        824, 826, 832, 848, 854, 856, 858, 867, 873, 880
};

public static  int binario(int [] s, int x){
    int meio;
    int inicio, fim;
    inicio= 0;
    fim=s.length -1;

    while(inicio<=fim){
        meio= (inicio+ fim)/2;
        if (s[meio] == x){
            return meio;
        }

        else if(s[meio]< x){ //se o elemento do emio for menor que o valor que queremos achar, ignorar o inicio
            meio = inicio +1;
            else if (s[meio]>x) 
            fim= meio -1;
                
            



        }

        }
    }
}

