//sleepIn: http://codingbat.com/prob/p187868

public boolean sleepIn(boolean weekday, boolean vacation){
  if (!weekday || vacation) {
    return true;
  }
  return false;
}

//monkeyTrouble: http://codingbat.com/prob/p181646

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return((aSmile && bSmile) ||(!aSmile && !bSmile));
}
//sumDouble: http://codingbat.com/prob/p154485

public int sumDouble(int a, int b) {
  if(a == b){
    return (a+b) * 2;
  }else{
    return a+b;
  }
}

//diff21: http://codingbat.com/prob/p116624

public int diff21(int n) {
  if(n > 21){
    return Math.abs(n-21) *2;
  }else{
    return Math.abs(n-21);
  }
}

//parrotTrouble: http://codingbat.com/prob/p140449

public boolean parrotTrouble(boolean talking, int hour) {
  return(hour<7 && talking || hour>20 &&talking);
}

//makes10: http://codingbat.com/prob/p182873

public boolean makes10(int a, int b) {
  return(a==10 || b==10 ||a+b == 10);
}

//nearHundred: http://codingbat.com/prob/p184004

public boolean nearHundred(int n) {
  return(Math.abs(100-n) <=10 || Math.abs(200-n) <=10);
}

//posNeg: http://codingbat.com/prob/p159227

public boolean posNeg(int a, int b, boolean negative) {
  if(negative){
    return a < 0 && b < 0;
  }else{
    return a < 0 && b > 0  || a > 0 && b < 0;
  }
}

//notString: http://codingbat.com/prob/p191914

public String notString(String str) {
  if(str.length() >=3 && str.substring(0,3).equals("not")){
    return str;
  }else{
    return "not " + str;
  }
}

//missingChar: http://codingbat.com/prob/p190570

public String missingChar(String str, int n) {
  String front = str.substring(0,n);
  String back = str.substring(n+1, str.length());
  return front + back;
}

//frontBack: http://codingbat.com/prob/p123384

public String frontBack(String str) {
  if(str.length() <= 1) return str;
    String mid = str.substring(1,str.length()-1);
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}

//front3: http://codingbat.com/prob/p136351

public String front3(String str) {
  String front;
  if(str.length() >= 3){
    front = str.substring(0,3);
  }
  else{
    front = str;
  }
  return front + front + front;
}

//backAround: http://codingbat.com/prob/p161642

public String backAround(String str) {
  String last = str.substring(str.length() -1);
  return last + str + last;
}

//or35: http://codingbat.com/prob/p112564

public boolean or35(int n) {
  if(n % 3 == 0 ) return true;
  if(n % 5 == 0) return true;
  return false;
}

//front22: http://codingbat.com/prob/p183592

public String front22(String str) {
  int take = 2;
  if(take>str.length()){
    take = str.length();
  }
  String front = str.substring(0,take);
  return front + str+ front;
}

//startHi: http://codingbat.com/prob/p191022

public boolean startHi(String str) {
  if(str.length() < 2) return false;
  if(str.substring(0,2).equals("hi")){ 
    return true;
  }
  return false;
}

//icyHot: http://codingbat.com/prob/p192082

public boolean icyHot(int temp1, int temp2) {
  if(temp1 < 0 && temp2 > 100){
    return true;
  }
    if(temp1 > 100 && temp2 < 0){
      return true;
    }
    return false;
}

//in1020: http://codingbat.com/prob/p144535

public boolean in1020(int a, int b) {
  return((a>= 10 && a<= 20) ||(b>=10 && b<=20));
}

//hasTeen: http://codingbat.com/prob/p178986

public boolean hasTeen(int a, int b, int c) {
 return(a>=13&&a<=19) ||
       (b>=13&&b<=19) ||
       (c>=13&&c<=19);
}

//loneTeen: http://codingbat.com/prob/p165701

public boolean loneTeen(int a, int b) {
  boolean aTeen = (a>=13 && a<=19);
  boolean bTeen = (b>=13 && b<=19);
  return(aTeen && !bTeen) || (!aTeen && bTeen);
}

//delDel: http://codingbat.com/prob/p100905

public String delDel(String str) {
  if(str.length()>=4 && str.substring(1,4).equals("del")){
    return str.substring(0,1)+ str.substring(4);
  }
  return str;
}

//mixStart: http://codingbat.com/prob/p151713

public boolean mixStart(String str) {
  if((str.length() >= 3) && (str.substring(1,3).equals("ix"))){
    return true;
  }
  return false;
}

//startOz: http://codingbat.com/prob/p199720

public String startOz(String str) {
  String result ="";
  if((str.length()>=1) && (str.substring(0,1).equals("o"))){
    result = result + str.charAt(0);
  }
  if((str.length()>=2) && (str.substring(1,2).equals("z"))){
    result = result +str.charAt(1);
  }
  return result;
}

//intMax: http://codingbat.com/prob/p101887

public int intMax(int a, int b, int c) {
  if((a>b)&&(a>c)){
    return a;
  }
  if((b>a) &&(b>c)){
    return b;
  }
  return c;
}

//close10: http://codingbat.com/prob/p172021

public int close10(int a, int b) {
  int aVal = Math.abs(a - 10);
  int bVal = Math.abs(b - 10);
  if(aVal<bVal){
    return a;
  }
  if(aVal>bVal){
    return b;
  }
  return 0;
}

//in3050: http://codingbat.com/prob/p132134

public boolean in3050(int a, int b) {
  if((a>=30 && a<=40) && (b>=30&&b<=40)){
    return true;
  }
  if((a>=40 && a<=50)&&(b>=40 && b<=50)){
    return true;
  }
  return false;
}

//max1020: http://codingbat.com/prob/p177372

public int max1020(int a, int b) {
if(b>a){
  int temp = a;
  a=b;
  b=temp;
}
if(a>=10 && a<=20) return a;
if(b>=10 && b<=20) return b;
return 0;
}

//stringE: http://codingbat.com/prob/p173784

public boolean stringE(String str) {
  int ct =0;
  for(int i = 0; i<str.length(); i++){
    if(str.charAt(i) =='e') ct++;
  }
 return(ct >=1 && ct <=3);
}

//lastDigit: http://codingbat.com/prob/p125339

public boolean lastDigit(int a, int b) {
   return(a%10 == b%10);
}

//endUp: http://codingbat.com/prob/p125268

public String endUp(String str) {
  if(str.length()<=3) return str.toUpperCase();
  int cut = str.length() - 3;
  
  String front = str.substring(0,cut);
  String back = str.substring(cut);
  
  return front + back.toUpperCase();
}

//everyNth: http://codingbat.com/prob/p196441

public String everyNth(String str, int n) {
  String nth = "";
  for(int i = 0; i<str.length(); i +=n){
    nth = nth +str.charAt(i);
  }
  return nth;
}

//stringTimes: http://codingbat.com/prob/p142270

public String stringTimes(String str, int n) {
  String result = "";
  for(int i = 0; i<n; i++){
    result = result +str;
  }
  return result;
}

//frontTimes: http://codingbat.com/prob/p101475

public String frontTimes(String str, int n) {
 int frontLen = 3;
 if(frontLen > str.length()){
   frontLen = str.length();
 }
 String front = str.substring(0, frontLen);
 String result = "";
 for(int i = 0; i<n; i++){
   result = result + front;
 }
 return result;
}

//countXX: http://codingbat.com/prob/p194667

int countXX(String str) {
  int ct= 0;
  for(int i = 0; i< str.length()-1; i++){
    if(str.substring(i,i+2).equals("xx")) ct++;
  }
  return ct;
}

//doubleX: http://codingbat.com/prob/p186759

boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false;
  if(i+1>=str.length())return false;
  return str.substring(i+1,i+2).equals("x");
}

//stringBits: http://codingbat.com/prob/p165666

public String stringBits(String str) {
 String result = "";
 for(int i = 0; i<str.length(); i +=2){
   result = result +str.substring(i,i+1);
 }
 return result;
}

//stringSplosion: http://codingbat.com/prob/p117334

public String stringSplosion(String str) {
  String result="";
  for(int i = 0; i<str.length(); i++){
    result = result + str.substring(0, i+1);
  }
  return result;
}

//last2: http://codingbat.com/prob/p178318

public int last2(String str) {
  if(str.length()<2)return 0;
  String end = str.substring(str.length()-2);
  int count = 0;
  
  for (int i = 0; i<str.length()-2; i++){
    String sub = str.substring(i, i+2);
    if(sub.equals(end)) {
      count++;
    }
  }
  return count;
  
}


//arrayCount9: http://codingbat.com/prob/p184031

public int arrayCount9(int[] nums) {
  int ct=0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i]==9)ct++;
  }
  return ct;
}

//arrayFront9: http://codingbat.com/prob/p186031

public boolean arrayFront9(int[] nums) {
  int end = nums.length;
  if(end>4) end = 4;
  for(int i = 0; i<end; i++){
    if(nums[i] == 9) return true;
  }
  return false;
}

//array123: http://codingbat.com/prob/p136041

public boolean array123(int[] nums) {
  for(int i = 0; i<nums.length -2; i++){
    if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
        return true;
  }
    return false;
}


//stringMatch: http://codingbat.com/prob/p198640

public int stringMatch(String a, String b) {
  
}

//stringX: http://codingbat.com/prob/p171260

public String stringX(String str) {
  String result = "";
  for(int i = 0; i< str.length(); i++){
    if(!(i>0 && i <(str.length()-1) && str.substring(i, i +1).equals("x"))){
     result = result + str.substring(i,i+1);
    }
  }
  return result;
}

//altPairs: http://codingbat.com/prob/p121596

public String altPairs(String str) {
  String result = "";
  for(int i = 0; i<str.length(); i+=4){
    int end = i+2;
    if(end>str.length()){
      end = str.length();
    }
    result = result + str.substring(i,end);
  }
  return result;
}
  
   

//stringYak: http://codingbat.com/prob/p126212

public String stringYak(String str) {
  String result = "";
  for(int i = 0; i<str.length(); i++){
  if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
    i = i +2;
    
  } else{
    result = result + str.charAt(i);
  }
  }
  return result;
}

//array667: http://codingbat.com/prob/p110019

public int array667(int[] nums) {
  int ct = 0;
  for(int i = 0; i<(nums.length- 1); i++){
    if(nums[i]== 6){
      if(nums[i+1] == 6 || nums[i+1] == 7){
        ct++;
      }
    }
  }
  return ct;
}

//noTriples: http://codingbat.com/prob/p170221

public boolean noTriples(int[] nums) {
  for(int i = 0; i <nums.length-2; i++){
    int posone = nums[i];
    int postwo = nums[i +1];
    int posThree = nums[i+2];
    if((posone == postwo) && (posone == posThree)){
      return false;
    }
  }
  return true;
}

//has271: http://codingbat.com/prob/p167430

public boolean has271(int[] nums) {
  for(int i = 0; i < nums.length-2; i++){
  int val = nums[i];
  if(nums[i+1] ==(val+5) &&
    Math.abs(nums[i+2] - (val-1)) <=2){
      return true;
    }
  
  }
  return false;
}

//firstLast6: http://codingbat.com/prob/p185685

public boolean firstLast6(int[] nums) {
  for(int i =0; i<nums.length; i++){
  int x = nums[0];
  int y = nums[nums.length-1];
  if(x ==6){
    return true;
  }
  if(y == 6){
    return true;
  }
  }
  return false;
}

//sameFirstLast: http://codingbat.com/prob/p118976

public boolean sameFirstLast(int[] nums) {
 int x = nums.length;
 if(x >= 1){
    int y = nums[0];
    int z = nums[nums.length -1];
   if(z==y){
     return true;
   }
 }
 return false;
}

//makePi: http://codingbat.com/prob/p167011

public int[] makePi() {
  int[] pi ={3,1,4};
  return pi;
}

//commonEnd: http://codingbat.com/prob/p191991

public boolean commonEnd(int[] a, int[] b) {
 int x = a[0];
 int y = b[0];
 int z = a[a.length -1];
 int j = b[b.length -1];
 if(x==y){
   return true;
 }
 if(z == j){
   return true;
 }
 return false;
}

//sum3: http://codingbat.com/prob/p175763

public int sum3(int[] nums) {
  int a = nums[0];
  int b = nums[1];
  int c = nums[2];
  return a+b+c;
}

//rotateLeft3: http://codingbat.com/prob/p185139

public int[] rotateLeft3(int[] nums) {
return new int[] {nums[1], nums[2], nums[0]};
}

//reverse3: http://codingbat.com/prob/p112409

public int[] reverse3(int[] nums) {
  return new int[] {nums[2], nums[1], nums[0]};
}

//maxEnd3: http://codingbat.com/prob/p146256

public int[] maxEnd3(int[] nums) {
  int a = nums[0];
  int b = nums[2];
  if(a>b){
    return new int[] {a,a,a};
  }
  else{
    return new int[] {b,b,b};
  }
}

//sum2: http://codingbat.com/prob/p190968

public int sum2(int[] nums) {
  if(nums.length>=2){
    return nums[0]+nums[1];
  } else if(nums.length>0 &&nums.length<2){
    return nums[0];
  }
  else{
    return 0;
  }
}

//middleWay: http://codingbat.com/prob/p146449

public int[] middleWay(int[] a, int[] b) {
  return new int[] {a[1],b[1]};
}

//makeEnds: http://codingbat.com/prob/p101230

public int[] makeEnds(int[] nums) {
  return new int[]{nums[0], nums[nums.length-1]};
}

//has23: http://codingbat.com/prob/p171022

public boolean has23(int[] nums) {
  if(nums[0] == 2 || nums[0] ==3){
    return true;
  }
  if(nums[1] ==2 || nums[1] ==3){
    return true;
  }
  return false;
}

//no23: http://codingbat.com/prob/p175689

public boolean no23(int[] nums) {
  if(nums[0] != 2 && nums[0] != 3){
     if(nums[1] != 2 && nums[1] != 3){
    return true;
  }
  }
 
  return false;
}

//makeLast: http://codingbat.com/prob/p137188

public int[] makeLast(int[] nums) {
  int num[] = new int[nums.length*2];
  num[num.length-1] = nums[nums.length-1];
  return num;
  
}

//double23: http://codingbat.com/prob/p145365

public boolean double23(int[] nums) {
    if(nums.length<1 || nums.length <=1)
  {
    return false;
  }
  if((nums[0]==2 && nums[1] ==2) || (nums[0] ==3 && nums[1]==3)){
    return true;
  }

  return false;
}

//fix23: http://codingbat.com/prob/p120347

public int[] fix23(int[] nums) {
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 2 && nums[i+1] == 3){
     nums[i+1] = 0;
    }
  }
  return nums;
}

//start1: http://codingbat.com/prob/p109660

public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length != 0){
    if(a[0] ==1){
      count++;
    }
  }
  if(b.length !=0){
    if(b[0] ==1){
      count++;
    }
  }
  return count;
 

}

//biggerTwo: http://codingbat.com/prob/p109537

public int[] biggerTwo(int[] a, int[] b) {
  int x = a[1]+a[0];
  int y = b[0]+b[1];
   if( x==y){
     return a;
   }
   if(x>y){
     return a;
   }
   else{return b;}
}

//makeMiddle: http://codingbat.com/prob/p199519

public int[] makeMiddle(int[] nums) {

return new int[] {nums[nums.length/2-1], nums[nums.length/2]};
  

}

//plusTwo: http://codingbat.com/prob/p180840

public int[] plusTwo(int[] a, int[] b) {
  int x = a[0];
  int y = a[1];
  int z = b[0];
  int c = b[1];
  return new int[]{x,y,z,c};
}

//swapEnds: http://codingbat.com/prob/p118044

public int[] swapEnds(int[] nums) {
  
}

//midThree: http://codingbat.com/prob/p155713

public int[] midThree(int[] nums) {
  
}

//maxTriple: http://codingbat.com/prob/p185176

public int maxTriple(int[] nums) {
  
}

//frontPiece: http://codingbat.com/prob/p142455

public int[] frontPiece(int[] nums) {
  
}

//unlucky1: http://codingbat.com/prob/p197308

public boolean unlucky1(int[] nums) {
if(nums.length > 4){
  if(nums[1] == 1 && nums[2] ==3){
    return true;
}
}
return false;
}

//make2: http://codingbat.com/prob/p143461

public int[] make2(int[] a, int[] b) {
  
}

//front11: http://codingbat.com/prob/p128270

public int[] front11(int[] a, int[] b) {
  
}
