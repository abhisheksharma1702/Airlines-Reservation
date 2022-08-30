import { AbstractControl,ValidationErrors,ValidatorFn } from '@angular/forms';
export class Registation {
    id:number;
    title:string;
    firstName:string;
    lastName:string;
    email:string;
    password:string;
    dob:string;
    phoneNumber:string;
}
export class CustomValidation{
    static MatchValidate(source:string,target:string):ValidatorFn{
      return (control:AbstractControl):ValidationErrors | null=>{
          const sourceCtrl=control.get(source);
          const targetCtrl=control.get(target);
          return sourceCtrl && targetCtrl && sourceCtrl.value!==targetCtrl.value ?{mismatch:true}:null;
      }
    }
  }
