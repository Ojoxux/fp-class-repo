/**
 * 2025-11-10
 * 題目: 純粋関数のリファクタリングをTSで行ってみよう
 */

class TipCalculator {
  private names: string[] = [];
  private tipPercentage: number = 0;

  public addPerson(name: string): void {
    this.names.push(name);
    this.tipPercentage = this.calculateTipPercentage(this.names.length);
  }

  private calculateTipPercentage(personCount: number): number {
    if (personCount > 5) return 20;
    if (personCount > 0) return 10;
    return 0;
  }

  public getNames(): string[] {
    return this.names;
  }

  public getTipPercentage(): number {
    return this.tipPercentage;
  }
}

// デバッグ用のコード
const tipCalculator = new TipCalculator();
tipCalculator.addPerson("a");
tipCalculator.addPerson("b");
tipCalculator.addPerson("c");
tipCalculator.addPerson("d");
tipCalculator.addPerson("e");
tipCalculator.addPerson("f");
tipCalculator.addPerson("g");

console.log(tipCalculator.getNames());
console.log(tipCalculator.getTipPercentage());

/**
 * 元のコード
 * class TipCalculator {
 *   private names: string[] = [];
 *   private tipPercentage: number = 0;
 *
 *   public addPerson(name: string): void {
 *     this.names.push(name);
 *     if (this.names.length > 5) {
 *       this.tipPercentage = 20;
 *     } else if (this.names.length > 0) {
 *       this.tipPercentage = 10;
 *     }
 *   }
 *
 *   public getNames(): string[] {
 *     return this.names;
 *   }
 *
 *   public getTipPercentage(): number {
 *     return this.tipPercentage;
 *   }
 * }
 */
